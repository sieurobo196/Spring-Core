package com.codewr.output.impl;

import com.codewr.output.IOutputGenerator;

/**
 *
 * @author codewr
 */
public  class JsonOutputGenerator implements IOutputGenerator {

    public void generateJSONOutput() {
        System.out.println("This is JSON Output Generator");
    }

    public void generateCSVOutput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
