package de.cooperateproject.eabridge.services.hbdbfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.teneo.annotations.mapper.PersistenceFileProvider;

public class URIPersistenceFileProvider extends PersistenceFileProvider {

    @Override
    public InputStream getFileContent(Class<?> clz, String path) {
        try {
            URL mappingUrl = FileLocator.toFileURL(new URL(path));
            URI mappingURI = new URI(mappingUrl.getProtocol(), mappingUrl.getPath(), null);
            return new FileInputStream(new File(mappingURI));
        } catch (IOException | URISyntaxException e) {
            //Intentionally left blank
        }

        return super.getFileContent(clz != null ? clz : PersistenceFileProvider.class, path);
    }

}
