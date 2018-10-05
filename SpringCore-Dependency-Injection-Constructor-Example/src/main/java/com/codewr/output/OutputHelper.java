package com.codewr.output;

import com.codewr.output.IOutputGenerator;

public class OutputHelper {

    IOutputGenerator outputGenerator;

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    //DI via constructor
    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

}
