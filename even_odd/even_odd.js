// Function to check if a number is even or odd
function checkEvenOrOdd(number) {
    if (number % 2 === 0) {
        return "Even";
    } else {
        return "Odd";
    }
}

// Test the function
var numberToCheck = 10; // You can replace this with any number you want to check
var result = checkEvenOrOdd(numberToCheck);
console.log(numberToCheck + " is " + result);
