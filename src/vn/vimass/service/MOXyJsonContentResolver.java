package vn.vimass.service;

/**
 * Created by thaohm on 1/25/14.
 */


import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class MOXyJsonContentResolver implements ContextResolver<MoxyJsonConfig> {

    private final MoxyJsonConfig config;

    public MOXyJsonContentResolver() {
        config = new MoxyJsonConfig()
                .setAttributePrefix("")
                .setValueWrapper("value")
                .property(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
    }

    @Override
    public MoxyJsonConfig getContext(Class<?> objectType) {
        return config;
    }

}