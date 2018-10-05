package com.codewr.output;

import com.codewr.output.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void generateSCVOutput() {
		outputGenerator.generateCSVOutput();
	}
        public void generateJSONOutput() {
		outputGenerator.generateJSONOutput();
	}

	//DI via setter method
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}