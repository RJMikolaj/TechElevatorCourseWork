/*
* Add Events and functions to move the Ship and Win the game
*/
// Creates the Grid -- this should only occur after the DOM loads
document.addEventListener('DOMContentLoaded', () => {
  createGrid();

  document.querySelector('body').addEventListener('keydown', (event) => {
    if (event.key === 'ArrowRight') {
      moveShipRight();
    }
    if (event.key === 'ArrowLeft') {
      moveShipLeft();
    }

  });

});

function moveShipRight() {
  const ship = getShipLocation();
  const right = ship.nextElementSibling;
  moveShip(ship, right);
}

function moveShipLeft() {
  const ship = getShipLocation();
  const left = ship.nextElementSibling;
  moveShip(ship, left);
}

function moveShipDown() {
  const ship = getShipLocation();
  const down = getUpperOrLowerElementAtIndex(ship, ship.parentElement.nextElementSibling);
  moveShip(ship, down);
}

function moveShipUp() {
  const ship = getShipLocation();
  const down = getUpperOrLowerElementAtIndex(ship, ship.parentElement.nextElementSibling);
  moveShip(ship, up);

}

function moveShip(shipElement, newElement) {
  shipElement.classList.remove('boat');
  newElement.classList.add('boat');
}

function getUpperOrLowerElementAtIndex(ship, newElement) {
  let elementAtIndex = null;
  if (newElement != null) {
    const index = Array.from(element.parentNode.children).indexOf(element);
  }
}

/**
 * Reset the Game
 */
function resetGame() {
  // Inform the user they can start
  const announce = document.querySelector('announce');
  announce.innerText = 'Play!';

  // Set the starting location of the player and treasure
  const frame = document.getElementById('frame');
  frame.firstElementChild.firstElementChild.classList.add('boat');
  frame.lastElementChild.lastElementChild.classList.add('treasure');


}

function getShipLocation() {
  return document.getElementById('frame').querySelector('.boat');
}

/**
 * Creates the game grid
 */
function createGrid() {
  const frame = document.getElementById('frame');

    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame);
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {element} frame
 */
function buildRow(frame) {
  const row = document.createElement('div');
  row.classList.add('row');
  frame.insertAdjacentElement('beforeend', row);

   // Add code to create rows
    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i);
    }
}

/**
 * Builds the grid squares
 * @param {element} row
 * @param {int} count
 */
function buildSquare(row, count) {
   // Add code to create the grid Squares
   const square = document.createElement('div');
   square.classList.add('square');
    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            square.classList.add('pirate');
        }
    }
    row.insertAdjacentElement('beforeend', square);

}
