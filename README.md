## Number To Word Converter

`v0.1.0-beta` version

### Imports

* **add** the following repository into your pom.xml file.

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

* **add** the following dependency into your pom.xml file together with your other dependencies.

```xml

<dependency>
    <groupId>com.github.jmngige</groupId>
    <artifactId>numwordconverter</artifactId>
    <version>v0.1.0-beta</version>
</dependency>
```
## Implementation
Once the library is correctly imported, create an instance of `NumbetoWordConverter` and call the `EnglishNumber` function. Check the implementation below.

```java
NumbetoWordConverter converter = new NumbetoWordConverter();
Long number = 100_000_000; //or 100000000
String inwords = converter.EnglishNumber(number);
System.out.println(inwords);
```
**Output**
    One Hundred Million
