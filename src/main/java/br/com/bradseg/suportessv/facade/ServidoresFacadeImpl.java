package br.com.bradseg.suportessv.facade;

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
        return env.getProperty("app.scripts.fileserver");
    }

}