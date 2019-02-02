/**
 * 
 */
/**
 * @author venkat
 *
 */
module lambda {
    // this module only needs types from the base module 'java.base';
    // because every Java module needs 'java.base', it is not necessary
    // to explicitly require it - I do it nonetheless for demo purposes
    requires java.base;
    // this export makes little sense for the application,
    // but once again, I do this for demo purposes
    exports lambda;
    
}

/*
		
	$ javac
	    -d target/classes
	    ${source-files}
	$ jar --create
	    --file target/jpms-hello-world.jar
	    --main-class org.codefx.demo.jpms.HelloModularWorld
	    -C target/classes .
	$ java --module-path target/jpms-hello-world.jar --module org.codefx.demo.jpms_hello_world
	    
	set JAVA_HOME=c:\downloads\jdk11.0.2
	set PATH=c:\downloads\jdk11.0.2\bin;%PATH%
	
	javac -d target/classes C:\Users\venkat\workspace_4.10\Examples_JDK11\src\lambda\*.java C:\Users\venkat\workspace_4.10\Examples_JDK11\src\*.java
	jar -cfe target/jpms-lambda-calculator.jar lambda.Calculator -C target\classes .
	java -p target/jpms-lambda-calculator.jar --module lambda  
	   
	c:\downloads\jdk11.0.2\bin\javac -d target/classes C:\Users\venkat\workspace_4.10\Examples_JDK11\src\lambda\*.java C:\Users\venkat\workspace_4.10\Examples_JDK11\src\*.java
	c:\downloads\jdk11.0.2\bin\jar -cfe target/jpms-lambda-calculator.jar lambda.Calculator -C target\classes .  
	c:\downloads\jdk11.0.2\bin\java -p target/jpms-lambda-calculator.jar --module lambda
	
	c:\downloads\jdk11.0.2\bin\java --describe-module java.sql
	
	
	javac --module-path C:\Users\venkat\workspace_4.10\Examples_JDK11\target -d target/classes C:\Users\venkat\workspace_4.10\Example_JDK11_client\src\*.java 
	javac --module-path C:\Users\venkat\workspace_4.10\Examples_JDK11\target -d target/classes C:\Users\venkat\workspace_4.10\Example_JDK11_client\src\\lambda\client\*.java
	jar -cfe target/jpms-lambda-client-calculator.jar lambda.client.CalculatorClient -C target\classes .
    java --module-path C:\Users\venkat\workspace_4.10\Examples_JDK11\target -m lambda.client
    java --module-path C:\Users\venkat\workspace_4.10\Examples_JDK11\target C:\Users\venkat\workspace_4.10\Example_JDK11_client\target -m lambda.client



	 
*/