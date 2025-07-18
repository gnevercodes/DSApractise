Public means you can access it anywhere
private means only it's file can access it.
default means you will not be able to access it outside the package.
protected

    | classs | package | subclass(same package ) | subclass( with different package ) | world(diff package and not a subclass)

public + + + + +
protected +. + + + +
default + +. + - -
private. + - - - -

PACKAGES :

- there are user defined and one is in built.
  --> Inbuilt Packages

1.  Lang packages : basics stuff , language specific stuff. automatically imported
2.  io : input output classes for file i/o , buffered reader.
3.  Util : dedicated for data structures .
4.  applet : servelet.
5.  awt : not recommended.
6.  net

OBJECT Class:

- root of class hierarchy.
- hashcode , toString , finalize , equals() methods are present in this.
- hashcode : a unique representation of a number for a obj. random integer value for a obj
- .equals() : it checks
- == checks if both references point to the same obj or not
