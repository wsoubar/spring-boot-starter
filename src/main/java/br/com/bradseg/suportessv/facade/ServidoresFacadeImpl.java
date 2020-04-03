package br.com.bradseg.suportessv.facade;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * ServidoresFacadeImpl
 */
@Service
public class ServidoresFacadeImpl implements ServidoresFacade {

    @Autowired
    private Environment env;
    
    @Override
    public String toString() {
        File f = new File(env.getProperty("app.scripts.fileserver"));
        return f.getAbsolutePath();
    }

}