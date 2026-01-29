# how to work with files

1. how input and output stream works.
2. how input files and output files can be generated.

## Streams :

1. stream is a sequence of data.
2. character(unicode) or byte values.
3. this is a abstraction that java basically provides.
4. This stream is then linked to output ports by built in methods.

### java.io package.

1. implemented in java hierarchy.
2. System.in. : in is a final keyword input stream == null.
3. these are in input stream classes.

## types of streams in java

1. Bytestream.`input and output byte`
   1. inputstream
   2. outputstream
2. character stream.
   1. reader
   2. writer.

## important methods.

1. read and write methods.
2. `input stream = read`
3. `output stream = write`.

### predefined streams in java

1. system.out == standard output stream = console
2. system.in == standard input stream = keyboard.
3. system.err == error str == console.

## how i/o operations actually work:

> [soucre] -> [Program] -> [Destination] .

## inputstream, outputstream , reader ,writer.

> Source ----> InputStream / Reader -----> Program

> program --> OutputStream / writer --> Destination .

![I/0 class Overview table](sc.png)

> Source → Stream → Program → Stream → Destination

> for most text files,binary files, Byte streams(imgs,videos,pdfs raw) , Character streams(text,csv,json,xml) , inputstream and outputstream are being used and for fast traversal and retrieval , Buffered are being used.

```
            JAVA I/O
               |
      --------------------
      |                  |
  Byte Streams       Character Streams
(InputStream)         (Reader)
(OutputStream)        (Writer)
```

## Scanner class(most used for user input)

```java
int x = sc.nextInt();          // integer
long l = sc.nextLong();       // long
float f = sc.nextFloat();     // float
double d = sc.nextDouble();   // double
boolean b = sc.nextBoolean();// true / false
String s = sc.next();         // single word
String line = sc.nextLine();  // full line
```

- basics covered.
