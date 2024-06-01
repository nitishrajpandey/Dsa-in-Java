# Learning java

## 1 Introduction to java

### Q1. Write a "Hello world" program in java.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to  java programming.!!!");
    }
}
```

### @2. show the following design using print.

1=> Right half pyramid.

```java
public class Main {
    public static void main(String[] args) {
         System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
}

```

2=> Reverse Right half pyramid.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
}

```

3=> Left half pyramid.

```java
public class Main {
    public static void main(String[] args) {
       System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}

```

### 3. show the following design using single print statement.

```java

public class Main {
    public static void main(String[] args) {
        System.out.println("Right half pyramid !!!");
        System.out.println("*\n**\n***\n****\n*****");
        System.out.println("Reverse right half pyramid");
        System.out.println("*****\n****\n***\n**\n*");
        System.out.println("left half pyramid");
        System.out.println("    *\n   **\n  ***\n ****\n*****");
    }
}

```

### 4. Write a program to take name as input and show welcome massage .

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = userInput.nextLine();
        System.out.println("Welcome "+ name +" to java programming");
    }
}

```

### 5. Create a program to add two number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = userInput.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = userInput.nextInt();
        System.out.println("The total sum of "+num1+" and "+num2+" is : "+(num1+num2));
    }
}

```
