Java JDK Installation Guide (Windows)

Quick steps to install JDK 25 and run Java programs.

1. Download JDK

-> Go to Oracle JDK

-> Download Windows x64 installer.

2. Install JDK

-> Run the installer → follow instructions

-> Optional: check “Set JAVA_HOME” and “Add to PATH”

   Default path: C:\Program Files\Java\jdk-25

3. Verify Installation

-> Open Command Prompt and run:

-> java -version
   javac -version


Expected output:

  java version "25"
  javac 25

4. Set Environment Variables (if needed)

-> Windows → search Environment Variables → Edit System Variables

-> Add JAVA_HOME: C:\Program Files\Java\jdk-25

-> Add %JAVA_HOME%\bin to Path

5. Run a Sample Program

-> Create HelloWorld.java:

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


In CMD:

cd "C:\Users\YourName\Desktop"
javac HelloWorld.java
java HelloWorld


 Output: Hello, World!
