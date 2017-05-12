package io.tpDSI;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class RiskApplication extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new RiskApplication().run(args);
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
     environment.jersey().register(new RiskResource());
        environment.jersey().register(new PropertyResource());
     }

/*
    @Override
    public void initialize(Bootstrap<StockConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<StockConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(StockConfiguration configuration) {
                return configuration.getDataSourceFactory(); }
        }); }
    @Override
    public void run(StockConfiguration config, Environment env) throws Exception {
        DBIFactory factory = new DBIFactory();
        DBI jdbi = factory.build(env, config. DataSourceFactory(), "stock-db"); StockDao dao = jdbi.onDemand(User.class); env.jersey().register(new UserkResource(dao));
        env.jersey().register(new RiskResource());
        env.jersey().register(new UserRessource());
    }
    */
}

