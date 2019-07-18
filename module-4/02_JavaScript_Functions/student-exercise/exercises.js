/*
 * Document this function
 *Function isSummer. It should check the month, day, and hemisphere (northern
* or Southern) and return whether or not the season is summer.
 *
 *
 *
 */


function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */

 function isAdmitted(gpa, satScore, recommendation) {
   admitted = true;
   rejected = false;
   if (gpa > 4) {
     return admitted;
   }
   else if (satScore > 1300) {
     return admitted;
   }
   else if ((gpa > 3) && (recommendation === true)) {
     return admitted;
   }
   else if ((satScore > 1200) && (recommendation === true)) {
     return admitted;
   }
   else {
     return rejected;
   }
 }

/**
 * Write a function called useParameterToFilterArray so that it takes an anonymous
 * function and uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
//
let unfilteredArray = [1, 2, 3, 4, 5, 6];
function useParameterToFilterArray(numbersToFilter, func) {
  return unfilteredArray.filter( (num) => {
    return num % 2 ===0;

  });

}


/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

function makeNumber(thisString = 0) {
  let first = '42293';
  let second = "443";
  let firstNumber = parseInt(first, 10);
  let secondNumber = parseInt(second, 10);
  return thisString = makeNumber.first + makeNumber.second;
  // let result = `${first} ${second}`;
  // return result;
}




/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll(arr) {
  const sum = arr.reduce( (sum, val) => {
    return sum + val;
  });

}
//   if(arr.length > 0) {
//   return  sum =+ arr[i];
//   }
//   else {
//     return 0;
//   }
// }

/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */
 function makeHappy() {
   var array1 = ['birthday', 'day'];
   const happy = 'Happy';
   happy.insertAdjacentHTML('beforebegin', array1);

 }


/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into mailing addresses in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 */

/*
 * Create and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It should work for strings and numbers.
 */
 findLargest = function(string, num, array ){
   let thisArray = ["string", 5, 6];
   thisArray.forEach(findLargest);
    return Math.max.apply( Math, array );
};

/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
