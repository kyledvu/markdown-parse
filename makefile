test: MarkdownParse.java MarkdownParseTest.java

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	

MarkdownParseTest.class: MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParse.java MarkdownParseTest.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

clean:
	rm -f MarkdownParse.class
	rm -f MarkdownParseTest.class
