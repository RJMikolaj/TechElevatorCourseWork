const firstName = "John";

function greeting(name) {
  console.log("Hello " + name);
}

// Anonymous functions can be assigned to a variable
const doublesum = function(x, y) {
  let val = (x + y) * 2;
  return val;
};

// Invoked using the variable name
console.log(doubleSum(2, 4));

// Assigned to another variable
let anotherVar = doubleSum;

console.log (anotherVar(5,2) );

// Can also use Arrow Operator ( => ) to define an anonymous function
const tripleSum = (x, y) => {
  let val = (x + y) * 3;
  return val;
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let sum = arr.reduce( (sum, val) => {
  return sum + val;

} );

console.log(`The Sum is: ${sum}`);

// What this reduce method is doing is the same as the following:



function reduceArray(arr) {
  let sum = 0;
  for (let i =0, i < arr.length; i++) {
    sum += arr[i];
  }
  return sum;
}

// Second version of this:

function reduceArray(arr, func) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    func(sum, arr[i]);
  }
  return sum;
}

let sum = arr.reduce( (sum, val) => {
  if (val % 2 === 0) {
    return sum + val;
  }
  return sum;
});

console.log(sumOnlyEvens);


// Filter removes elements from the array using an anonymous function
// that returns true if the element should be kept and false if it should
// not

let filterby3 = (number) => {
  return number % 3 === 0;
};

let resultsOfOnly3 = arr.filter(filterby3);
console.table(resultsOfOnly3);


//Filter out names of longer than 5 characters
const longNames = stringArr.filter((name) => {
  return name.length >5;

});
console.table(longNames);

//WHat filter is doing in the backfround
function filterArrByLengthOf5(arr) {
  let newArr = [];
  for (let i = 0, i < arr.length; i++) {
    if (arr[i].length > 5) {
      newArr.push(arr[i]);
    }
  }
  return newArr;
}
console.table(filterArrByLengthOf5);


// Map applies to a change in every element in an array
const resultOfDouble = arr.map( (number) => {
  return number * 2;

} );
console.log(resultOfDouble);

const mapResultOfNameLength = stringArr.map(name => {
  if (name.length > 5) {
    return name;
  }
  return "";
});
console.table(mapResultofNameLength);

// Can use anonymous functions as arguments to our methods

function doMath(x, y, func) {
  let result = func(x, y);
  console.log(`The result is ${result}`)
}

doMath(10, 5, (x, y) => {return x + y; }) );
doMath(10, 5, (x, y) => {return x = y; }) );

doMath(-20 5, (x, y) => {
  let distance = Math.abs(x - y);
  let power3 - Math.pow(distance, 3);
  return "The result is " + power3;
});

function reduceAndAddLetterA(array, filterFunction) {
  return array.filter(filterFunction).map((val) => {
    return "A" + val;
  });
}

console.table(reduceAndAddLetterA(arr, (num) => {return num % 2 ===0;}) );
console.table(reduceAndAddLetterA(arr, (num) => {return num % 2 !==0;}) );

console.table( reduceAndAddLetterA(stringArr, (name) => { return name.length > 6;}) );
