const groceryList = document.getElementById('shopping-list');
// add pageTitle
const topPageTitle = 'My Shopping List';

// add groceries

let groceries = [
{id: 1, item: "Broccoli", completed: true },
{id: 2, item: 'Quinoa', completed: true },
{id: 3, item: 'Blacc Beans', completed: false },
{id: 4, item: 'Other Legumes', completed: false },
{id: 5, item: 'Water', completed: true },
{id: 6, item: 'The Bee Movie on VHS Tape', completed: true },
{id: 7, item: 'Buffalo Sauce', completed: true },
{id: 8, item: 'Gogurt for my Active Lifestyle', completed: true },
{id: 9, item: 'Habanero Peppers', completed: true },
{id: 10, item: 'Cold Ones', completed: true },

];


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
shoppingList.innerHTML = groceryList;
  const ul = document.getElementById('ul');
  groceries.forEach(groceries => {
    const li = document.createElement('li')
    li.innerText = groceries.item
    ul.appendChild(li)
  });
  groceryList.appendChild(ul);
}

/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {}

setPageTitle();

// displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
