# Data types and Inferred types

## What is a Data type?

### **Data:**

Here Data is some value or object like (5, karthik, 3.14, Ford Car, Employee etc.,) since the intention of writing programs is to solve some real world problems. To solve real world problems we need a way to tell the computer values like these. And these are called Data.

### **Type:**

A type would be a specification for what the data/ value would contain. Like in real world there are specification for a Car, we have provide that spec here in program. If we going to have a numbers or characters it would be very straight forward so these types are provided by the programming languages itself. But to have a data like Car and Employee we have to tell the program what values combined can be called a Ford Car and likewise for Employee. 

```json
// spec for Car
Model Name = "Ford Mustang"
Manufacturer Name = "Ford"
Engine Name = "V8 engine"
Price = 32,640

// spec for Employee
Employee Name = "Raju"
Employee Id = 112
Employee email = "raju@mcn.com"
```

If we want to have or represent Car or Employee in our program it had to have these details or values. These combined values will be called Car Type or Car Data Type.

## Data types offered by Kotlin

As mentioned earlier there are simple types have already been provided by kotlin to store some type of values like Characters, Words, Numbers, Numbers with floating point and Yes/ No values can be stored without us mentioning any type specification to the program.

### **Numbers**

| Type | Size (bits) | Min value | Max value |
| --- | --- | --- | --- |
| `Byte` | 8 | -128 | 127 |
| `Short` | 16 | -32768 | 32767 |
| `Int` | 32 | -2,147,483,648 (-231) | 2,147,483,647 (231 - 1) |
| `Long` | 64 | -9,223,372,036,854,775,808 (-263) | 9,223,372,036,854,775,807 (263 - 1) |

### Floating-Point Types

| **Type** | **Size (bits)** | **Min value (Approx.)** | **Max value (Approx.)** |
| --- | --- | --- | --- |
| **Float** | 32 | -3.4028235E38 | 3.4028235E38 |
| **Double** | 64 | -1.7976931348623157E308 | 1.7976931348623157E308 |
- **char =** letter (2 bytes)
- **String =** words (2 bytes for each char)
- **Boolean =** to store Yes/ No (1 byte)

### How to store value

A memory is required to store any type of value. Let’s say we want to show the user name as Ragu. Wherever in a program a value like `"Ragu"` is used it will be stored in a memory. Using like this `print("Ragu")` in a program the value `Ragu` will be stored in memory and used by the program. This type of using a value is called literal value.

Say we have to show the user name in more than one places like home screen, setting screen and so on. Using “Ragu” directly in program will only work for the user Ragu, if a new user “Devi” logs in they we have to change the program to show the user name as “Devi”, this is not possible if we directly write the user name in screens.

This is where the concept **variable** is useful in programs, almost all programming have this concept of variable means “varying or changing values” like the user name scenario.

If we have a variable for the user name then we can change the value in one place and all the screens or places in program will have the changed value. To do that we just use this syntax to create a variable. **Variable name = value** like this for user name `user_name = "Ragu"` .

A variable will typically will consist of these things:

- Name (Variable Name)
- Value (Data)
- Type (Data type)
- Address (memory)

In Kotlin we have one extra keyword called `var` and `val` these are used to mentioned if a value of a variable is changeable or not.

 

![kotlin_datatype.png](kotlin_datatype.png)

## Variable and Datatype

Variable and Datatype are two different things in programming, a Datatype is definition of the value like how much memory needed and what are the possible things can be done with this data type. Like if a datatype is `int` this means that we can store 4 bytes of data and we can do arithmetic on this datatype. So, these are the uses of having a Datatype.

A variable is used to store the value in memory, whereas using datatype helps to define how much memory needed for the value.

These two are used in different places in a program and also be used with combination. Places are like in a program if we need to store a value using both is mandatory as seen above, if the value is not needed or can’t be provided at the moment and will be provided later we can only use the data type without a variable. If not using variable we don’t have to use variable name also. More about these later in functions

## Static vs Dynamic typing

Here type obviously mean the Data type. Kotlin is a Statically typed language meaning the data type have to mentioned while creating values in programs. In a dynamically typed programming language we can ignore the data type while creating values in programs. Statically typed languages can enforce more rules making the program have less errors in production. If a solving a problem or building something in programs takes million of lines of code then using a static language is advisable.

### What difference does having type makes?

**Early Error Detection →** Errors are detected while writing the programs

**Readability →** Having type mentioned makes reading programs easier

**Performance Optimization →** Using memory effectively

But, having no type mentioned also has it’s benefits like concise code and so on

## Inferred Typing
Inferred typing in kotlin means most of the time we can ignore the data type for the value if the value is easily identifiable by kotlin. Most of the time when creating a variable with a value assigned directly at the time declaration we can omit the data type and just mention the variable name and whether it's modifiable or not like this
```kotlin
val name = "John"
```
