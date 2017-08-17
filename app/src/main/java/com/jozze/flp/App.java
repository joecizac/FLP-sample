package com.jozze.flp;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import io.realm.Realm;

public class App extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    Realm.init(this);
//    RealmConfiguration config = new RealmConfiguration.Builder()
//            .schemaVersion(1)
//            .migration(new MyRealmMigration())
//            .build();
//    Realm.setDefaultConfiguration(config);

    Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                    .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                    .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                    .build());
  }
}