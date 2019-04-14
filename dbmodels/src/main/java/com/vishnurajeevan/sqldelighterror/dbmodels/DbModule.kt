package com.vishnurajeevan.sqldelighterror.dbmodels

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides

@Module
class DbModule {
  @Provides fun providesAndroidDriver(context: Context): SqlDriver {
    return AndroidSqliteDriver(Database.Schema, context, "errored.db")
  }

  @Provides fun providesDatabase(driver: SqlDriver) : Database{
    return Database(driver)
  }
}
