package io;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NullReaderExample {
	  public static void main(String[] args) throws IOException {
	      Reader reader1 = new StringReader("test string data \n next ine");
	      Reader reader2 = Reader.nullReader();//new method
	      Reader reader3 = new CharArrayReader(new char[]{'a', 'b', 'c'});
	      printData(List.of(reader1, reader2, reader3));
	      reader1.close();
	      reader2.close();
	      reader3.close();
	      
	      write();
	  }
	  public static void printData(List<Reader> readers) {
	      readers.stream()
	             .map(BufferedReader::new)
	             .map(BufferedReader::lines)
	             .forEach(stream1 -> stream1.forEach(System.out::println));
	  }
	  
	  
	  public static void write() throws IOException {
	      Writer writer1 = new StringWriter();
	      Writer writer2 = Writer.nullWriter();//new method
	      Writer writer3 = new CharArrayWriter();
	      List<Writer> list = List.of(writer1, writer2, writer3);
	      writeData(list);

	      //just check the buf content via toString
	      list.forEach(writer -> {
	          //toString prints underlying data buffer -
	          //nullWriter has no buffer and does not override toString
	          System.out.printf("writer type: %s, toString: %s%n",
	                  writer.getClass().getSimpleName(),
	                  writer.toString());
	      });
	  }

	  public static void writeData(List<Writer> writers) throws IOException {
		  String str = null;
	      for (Writer writer : writers) {
	    	  str = Integer.toString(ThreadLocalRandom.current().nextInt());
	    	  System.out.printf("Writing :: ", str);
	          writer.write(str);
	          writer.close();
	      }
	  }

	  
}

