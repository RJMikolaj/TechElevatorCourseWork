/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const daysPerWeek = 7;
  console.log("Days of Week " + daysPerWeek);
  console.log(`There are ${daysPerWeek} days in the week`);

  // Declares a variable those value can be changed
  let daysPerMonth = 30;
  console.log(`There are ${daysPerMonth} days in the month`);

  // Declares a variable that will always be an array
  const weekdays = [
    'Monday',
    'Tuesday',
    'Wednesday',
    'Thursday',
    'Friday'
  ];

  console.log(weekdays);

  weekdays.push('Saturday');

  console.table(weekdays);

  weekdays[6] = 'Sunday';
  console.table(weekdays);

  console.log(`The days at index 2 is ${weekdays[2]}`);

  console.log('The last day on the array is ' + weekdays.pop());
  console.table(weekdays);

  weekdays[10] = 'Sunday';
  console.table(weekdays);

  console.log("Weekdays length: " + weekdays.length);
  console.log(weekdays);
}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

function sum2Numbers(x, y) {
  return x + y;
}

/**
 * Compares two values x and y.
 * == is loose equality
 * === is strict equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
 *  Objects are simple key-value pairs
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ],
    toString: function() {
      return `${this.lastName}, ${this.firstName}  ${this.age}`;
    }
  };

  // Log the object
console.table(person);
console.log(person);

  // Log the first and last name
console.log(`First name is ${person.firstName} and last name is ${person['lastName']}`)

  // Log each employee
console.table(person.employees);

  for (let i = 0; i < person.employees.length; i++) {
    console.log(person.employees[i]);
  }

console.log("To String: " + person.toString);
console.log("To String again: " + person.toString() );
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {
  return num1 + num2 + num3;
}


/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`);
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);

  // substr (starting Index , number of characters)
  console.log(`.substr(1, 3) - ${value.substr(1, 3)}`);
  console.log(`.substr(1, 100) - ${value.substr(1, 100)}`);

  // substring (starting index (inclusive) , ending index (exclusive) )
  console.log(`.substring(1, 3) -  ${value.substring(1, 3)}`);
  console.log(`.substring(1, 100) -  ${value.substring(1, 100)}`);

  /*
    Other Methods
        - split(string)
        - substr(number, number)
        - substring(number, number)
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}

function forcedNumericTypes(num) {
  console.log(`1 + parseInt(num) - ${1 + parseInt(num)}`);
  console.log(`1 + parseFloat(num) - ${1 + parseFloat(num)}`);

  console.log(`isNaN(1) - ${isNaN(1)}`);
  console.log(`isNaN('A') - ${isNaN('A')}`);
  console.log(`isNaN('2') - ${isNaN('2')}`);
  console.log(`isNaN('undefined') - ${isNaN(undefined)}`);
}
