
// add pageTitle
const topPageTitle = 'My Shopping List';

// add groceries

const groceries = [
'Broccoli', 'Quinoa', 'Legumes', 'Gogurt for my Active Lifestyle', 'Pancakes', 'Fight Milk', 'Waffles', 'Syrup', 'More Gogurt',
'Water Because Hydration is Key'];


/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title');
  pageTitle.innerHTML = topPageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */

function displayGroceries() {
// const shoppingList = document.getElementById('shopping-list');
  const ul = document.querySelector('.shopping-list ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item;
    ul.appendChild(li);
  });
}

/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const completed = document.addEventListener('click', function() {
    document.getElementById('.shopping-list ul').innerHTML = displayGroceries
  });
}


setPageTitle();

displayGroceries();

markCompleted();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
