JFLAGS = -g
JFLAGS1 = -cp
J = java
JC = javac
JCC = javacc
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
		Add.java \
		Sub.java \
		Mult.java \
		Div.java \
		Int.java \
		Floate.java \
		Expression.java \
		main.java 

default: classes javacc java exec

classes: $(CLASSES:.java=.class)

javacc:
		$(J) $(JFLAGS1) ./javacc.jar $(JCC) Jagger.jj

java:
		$(JC) *.java

exec:
		$(J) Jagger

clean:
		$(RM) *.class