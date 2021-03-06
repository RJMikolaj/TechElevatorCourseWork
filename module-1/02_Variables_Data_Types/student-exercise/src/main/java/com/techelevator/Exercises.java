package com.techelevator;

import java.awt.image.Raster;
import java.util.PrimitiveIterator.OfDouble;

import org.mockito.internal.matchers.VarargCapturingMatcher;
import org.objenesis.instantiator.perc.PercInstantiator;

public class Exercises {

	public static void main(String[] args) {

        // CAN USE FLOAT OR DOUBLE BUT USE THEM CONSISTENTLY
		/*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
<<<<<<< HEAD
		int racoonsInWoods = 3;
		int racoonsThatWentHome = 2;
		int racoonsLeftInWoods = racoonsInWoods - racoonsThatWentHome;
		System.out.println(racoonsLeftInWoods);
=======
		int raccoonsInWoods = 3;
		int raccoonsThatWentHome = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsThatWentHome;
		
>>>>>>> 73c87d4aa3f4f0c39a2187536413923a99de78b8
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int flowersWithoutBees = flowers - bees;
		System.out.println(flowersWithoutBees);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeonEating = 1;
		int pigeonFriendEating = 1;
		int allPigeonsEating = lonelyPigeonEating + pigeonFriendEating;
		System.out.println(allPigeonsEating);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int owlsJoining = 2;
		int allOwls = owlsOnFence + owlsJoining;
		System.out.println(allOwls);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int allBeaversWorking = beaversWorking - beaversSwimming;
		System.out.println(allBeaversWorking); 
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucansJoining = 1;
		int totalToucans = toucansSitting + toucansJoining;
		System.out.println(totalToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int floofTailsInATree = 4;
		int nuttyBois = 2;
		int hungrySquirrels = floofTailsInATree - nuttyBois;
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int dime = 10;
		int twoNickels = 10;
		int hiltTotalInCents = quarter + dime + twoNickels;
		System.out.println(hiltTotalInCents);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierClassMuffins = 18;
		int macAdamClassMuffins = 20;
		int flanneryClassMuffins = 17;
		int allClassMuffins = brierClassMuffins + macAdamClassMuffins + flanneryClassMuffins;
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoSpend = 24;
		int whistleSpend = 14;
		int totalHiltToySpend = yoyoSpend + whistleSpend;
		System.out.println(totalHiltToySpend);
	
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int miniMarshmallows = 5;
		int largeMarshmallows = 10;
		int riceKrispieTreatMarshmallowCasualites = miniMarshmallows + largeMarshmallows;

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltHouseSnow = 29;
		int brecknockElementarySnow = 17;
		int snowDifferenceInInches = hiltHouseSnow - brecknockElementarySnow;
		System.out.println(snowDifferenceInInches);
		
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltSpendOnTruck = 3;
		int hiltSpendOnPencilCase = 2;
		int hiltMoneyOnHand = 10;
		int hiltMoneyRemainder = hiltMoneyOnHand - (hiltSpendOnTruck + hiltSpendOnPencilCase);
		System.out.println(hiltMoneyRemainder);
		

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int allJoshMarbles = 16;
		int theMarblesJoshLost = 7;
		int marblesJoshHasLeft = allJoshMarbles - theMarblesJoshLost;
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashellsOwned = 19;
		int meganSeashellsDesired = 25;
		int meganSeashellsNeeded = meganSeashellsDesired - meganSeashellsOwned;
		
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloonsTotal = 17;
		int bradBalloonsRed = 8;
		int bradBalloonsGreen = bradBalloonsTotal - bradBalloonsRed;
		System.out.println(bradBalloonsGreen);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksPreviouslyOnShelf = 38;
		int booksPlacedOnShelf = 10;
		int booksNowOnShelf = booksPreviouslyOnShelf + booksPlacedOnShelf;
		System.out.println(booksNowOnShelf);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsOnABee = 6;
		int allBees = 8;
		int legsOnAllBees = legsOnABee * allBees;
		System.out.println(legsOnAllBees);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int costOfIceCreamCone = 99;
		int numberOfIceCreamConesPurchased = 2;
		int totalCostOfAllIceCreamPurchasedInCents = costOfIceCreamCone * numberOfIceCreamConesPurchased;
		System.out.println(totalCostOfAllIceCreamPurchasedInCents);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeededForBorderTotal = 125;
		int rocksInPossession = 64;
		int rocksStillNeeded = rocksNeededForBorderTotal - rocksInPossession;
		System.out.println(rocksStillNeeded);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesHiltHad = 38;
		int marblesHiltLost = 15;
		int marblesHiltStillHas = marblesHiltHad - marblesHiltLost;
		System.out.println(marblesHiltStillHas);
		

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int distanceInMiles = 78;
		int milesAlreadyDriven = 32;
		int milesRemaining = distanceInMiles - milesAlreadyDriven;
		System.out.println(milesRemaining);
		

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int morningSnowShovelingTimeInMinutes = 90;
		int afternoonSnowShovelingTimeInMinutes = 45;
		int totalSnowShovelingTimeInMinutes = morningSnowShovelingTimeInMinutes + afternoonSnowShovelingTimeInMinutes;
		System.out.println(totalSnowShovelingTimeInMinutes);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogPriceInCents = 90;
		int numberOfHotDogsPurchased = 6;
		int totalSpentOnHotDogsInCents = hotDogPriceInCents * numberOfHotDogsPurchased;
		System.out.println(totalSpentOnHotDogsInCents);
		

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int costOfPencil = 7;
		int moneyInPocket = 50;
		int pencilsThatCanBePurchased = moneyInPocket / costOfPencil;
		System.out.println(pencilsThatCanBePurchased);
		

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterfliesSeen = 33;
		int orangeButterfliesSeen = 20;
		int redButterfliesSeen = totalButterfliesSeen - orangeButterfliesSeen;
		System.out.println(redButterfliesSeen);
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int candyCost = 54;
		int amountPaidForCandy = 100;
		int changeDueForCandy = amountPaidForCandy - candyCost;
		System.out.println(changeDueForCandy);
		

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markTreesInBackyard = 13;
		int markTreesToBePlanted = 12;
		int markTotalTrees = markTreesInBackyard + markTreesToBePlanted;
		System.out.println(markTotalTrees);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillJoySeesGramgram = 2;
		int hoursInADay = 24;
		int hourstillJoySeesGramGram = daysTillJoySeesGramgram / hoursInADay;
		System.out.println(hourstillJoySeesGramGram);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGumNeeded = numberOfCousins * piecesOfGumPerCousin;
		System.out.println(totalPiecesOfGumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int dansCashBeforePurchase = 3;
		int danPurchaseCost = 1;
		int dansCashAfterPurchase = dansCashBeforePurchase - danPurchaseCost;
		System.out.println(dansCashAfterPurchase);
		

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnLake = 5;
		int peopleInBoats = 3;
		int peopleOnLake = boatsOnLake * peopleInBoats;
		System.out.println(peopleOnLake);
		

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int legosLost = 57;
		int ellensRemainingLegos = ellensLegos - legosLost;
		System.out.println(ellensRemainingLegos);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBaked = 35;
		int muffinsNeeded = 83;
		int muffinsToBeBaked = muffinsNeeded - muffinsBaked;
		System.out.println(muffinsToBeBaked);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int luucyCrayons = 290;
		int crayonDifference = willyCrayons - luucyCrayons;
		System.out.println(crayonDifference);
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int pagesOfStickers = 22;
		int stickersPerPage = 10;
		int totalStickers = pagesOfStickers * stickersPerPage;
		System.out.println(totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakes = 96;
		int hungryKids = 8;
		int cupcakesPerKid = totalCupcakes / hungryKids;
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookiesMade = 47;
		int gingerbreadCookiesPerJar = 6;
		int gingerbreadCookiesNotPlacedInJars = (gingerbreadCookiesMade % gingerbreadCookiesPerJar);
		System.out.println(gingerbreadCookiesNotPlacedInJars);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsMade = 59;
		int neighborsGivenCroissants = 8;
		int croissantsLeftOver = (croissantsMade % neighborsGivenCroissants);
		System.out.println(croissantsLeftOver);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookiesMade = 276;
		int oatmealCookiesPerTray = 12;
		int traysNeeded = oatmealCookiesMade / oatmealCookiesPerTray;
		System.out.println(traysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelsMade = 480;
		int pretzelsPerServing = 12;
		int servingsOfPretzels = pretzelsMade / pretzelsPerServing;
		System.out.println(servingsOfPretzels);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 53;
		int forgottenLemonCupcakes = 2;
		int lemonCupcakesPerBox = 3;
		int lemonCupcakesGivenAway = (lemonCupcakes - forgottenLemonCupcakes) / 3;
		System.out.println(lemonCupcakesGivenAway);
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksPrepared = 74;
		int peopleEatingCarrotsForBreakfast = 12;
		int leftoverCarrotSticks = carrotSticksPrepared % peopleEatingCarrotsForBreakfast;
		System.out.println(leftoverCarrotSticks);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelfCapacity = 7;
		int shelvesWithBears = teddyBears / shelfCapacity;
		System.out.println(shelvesWithBears);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int pictures = 20;
		int albums = 480;
		int picturesPerAlbum = albums / pictures;
		System.out.println(picturesPerAlbum);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
		int cardBoxCapacity = 8;
		int cardsPerBox = tradingCards % cardBoxCapacity;
		System.out.println(cardsPerBox);
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int bookQuantity = 210;
		int bookShelves = 10;
		int booksPerBookShelf = bookQuantity / bookShelves;
		System.out.println(booksPerBookShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int cristingCroissants = 17;
		int guestCount = 7;
		int croissantsPerGuest = cristingCroissants / guestCount;
		System.out.println(croissantsPerGuest);
		

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double billRate = 2.15;
		double jillRate = 1.90;
		double combinedRate = billRate + jillRate;
		int totalWalls = 20;
		double timeForFiveRooms = totalWalls / combinedRate;
		System.out.println(timeForFiveRooms);
		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
