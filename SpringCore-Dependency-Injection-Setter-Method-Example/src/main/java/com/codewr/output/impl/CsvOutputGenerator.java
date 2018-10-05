package com.codewr.output.impl;

import com.codewr.output.IOutputGenerator;

/**
 *
 * @author codewr
 */
public  class CsvOutputGenerator implements IOutputGenerator {

    public void generateCSVOutput() {
        System.out.println("This is CSV Output Generator");
    }

    public void generateJSONOutput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
