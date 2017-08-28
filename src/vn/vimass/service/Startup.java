package vn.vimass.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import vn.vimass.service.crawler.viviet.ViVietWebservice;


@ApplicationPath("/services")
public class Startup extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> result = new HashSet<>();
//        result.add(SMSWebservice.class);
        result.add(ViVietWebservice.class);
        result.add(MOXyJsonContentResolver.class);
        return result;
    }
}