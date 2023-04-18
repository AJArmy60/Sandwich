import scala.io.StdIn._
import scala.math._
//define counter variables
var pennies = 0
var sandcount = 0
var drinkcount = 0
var sidecount = 0
//define recipt variables
var sand1 = 0
var sand2 = 0
var sand3 = 0
var sand4 = 0
var sand5 = 0
var drink1 = 0
var drink2 = 0
var drink3 = 0
var drink4 = 0
var side1 = 0
var side2 = 0
var side3 = 0
var side4 = 0
var side5 = 0
var sand1count = 0
var sand2count = 0
var sand3count = 0
var sand4count = 0
var sand5count = 0
var drink1count = 0
var drink2count = 0
var drink3count = 0
var drink4count = 0
var side1count = 0
var side2count = 0
var side3count = 0
var side4count = 0
var side5count = 0
var sandnumber = 1
var drinknumber = 1
var sidenumber = 1
println("Welcome to the Cafe!")
//ask user about sandwiches
println("How many sandwiches do you want?")
var sandAmount = readInt()
if (sandAmount > 0){
while (sandAmount > sandcount){
  println("Choose from the following:")
  println("1: Roast beef and Cheddar Panini ($8.75)")
  println("2: Turkey and Provolone on a Roll ($7.50)")
  println("3: Chicken Salad Wrap ($7.00)")
  println("4: Meatball Sub ($9.50)")
  println("5: Veggie Supreme on Wheat ($6.50)")
  sandcount = sandcount + 1
  var sandType = readInt()
  if (sandType == 1){
    pennies = pennies + 875
    sand1 = sand1 + 1
  } else if (sandType == 2){
    pennies = pennies + 750
    sand2 = sand2 + 1
  } else if (sandType == 3){
    pennies = pennies + 700
    sand3 = sand3 + 1
  } else if (sandType == 4){
    pennies = pennies + 950
    sand4 = sand4 + 1
  } else if (sandType == 5){
    pennies = pennies + 650
    sand5 = sand5 + 1
  } else {}
  }
}
//ask user about drinks
println("How many drinks do you want?")
var drinkAmount = readInt()
if (drinkAmount > 0){
while (drinkAmount > drinkcount){
  println("Choose from the following:")
  println("1: Water ($1.50)")
  println("2: Soda ($2.50)")
  println("3: Iced Coffee ($2.50)")
  println("4: Boba ($3.75)")
  drinkcount = drinkcount + 1
  var drinkType = readInt()
  if (drinkType == 1){
    pennies = pennies + 150
    drink1 = drink1 + 1
  } else if (drinkType == 2){
    pennies = pennies + 250
    drink2 = drink2 + 1
  } else if (drinkType == 3){
    pennies = pennies + 250
    drink3 = drink3 + 1
  } else if (drinkType == 4){
    pennies = pennies + 375
    drink4 = drink4 + 1
  } else {}
  }
}
//ask user about sides
println("How many sides do you want?")
var sideAmount = readInt()
if (sideAmount > 0){
while (sideAmount > sidecount){
  println("Chooses from the following:")
  println("1: Chips ($2.00)")
  println("2: Fries ($3.50)")
  println("3: Salad ($2.50)")
  println("4: Cole Slaw ($2.25)")
  println("5: Potato Salad ($2.25)")
  sidecount = sidecount + 1
  var sideType = readInt()
  if (sideType == 1){
    pennies = pennies + 200
    side1 = sand1 + 1
  } else if (sideType == 2){
    pennies = pennies + 350
    side2 = side2 + 1 
  } else if (sideType == 3){
    pennies = pennies + 250
    side3 = side3 + 1
  } else if (sideType == 4){
    pennies = pennies + 225
    side4 = side4 + 1
  } else if (sideType == 5){
    pennies = pennies + 225
    side5 = side5 + 1
  } else {}   
  }
}
//print recipt
if (sandAmount > 0 || drinkAmount > 0 || sideAmount > 0){
  println("Your order:")
  while (sand1 > sand1count){
    println("Sandwich " + sandnumber + ": Roast Beef and Cheddar Panini")
    sand1count = sand1count + 1
    sandnumber = sandnumber + 1
  }
  while (sand2 > sand2count){
    println("Sandwich " + sandnumber + ": Turkey and Provolone on a Roll")
    sand2count = sand2count + 1
    sandnumber = sandnumber + 1
  }
  while (sand3 > sand3count){
    println("Sandwich " + sandnumber + ": Chicken Salad Wrap")
    sand3count = sand3count + 1
    sandnumber = sandnumber + 1
  }
  while (sand4 > sand4count){
    println("Sandwich " + sandnumber + ": Meatball Sub")
    sand4count = sand4count + 1
    sandnumber = sandnumber + 1
  }
  while (sand5 > sand5count){
    println("Sandwich " + sandnumber + ": Veggie Supreme on Wheat")
    sand5count = sand5count + 1
    sandnumber = sandnumber + 1
  }
  while (drink1 > drink1count){
    println("Drink " + drinknumber + ": Water")
    drink1count = drink1count + 1
    drinknumber = drinknumber + 1
  }
  while (drink2 > drink2count){
    println("Drink " + drinknumber + ": Soda")
    drink2count = drink2count + 1
    drinknumber = drinknumber + 1
  }
  while (drink3 > drink3count){
    println("Drink " + drinknumber + ": Iced Coffee")
    drink3count = drink3count + 1
    drinknumber = drinknumber + 1
  }
  while (drink4 > drink4count){
    println("Drink " + drinknumber + ": Boba")
    drink4count = drink4count + 1
    drinknumber = drinknumber + 1
  }
  while (side1 > side1count){
    println("Sides " + sidenumber + ": Chips")
    side1count = side1count + 1
    sidenumber = sidenumber + 1
  }
  while (side2 > side2count){
    println("Sides " + sidenumber + ": Fries")
    side2count = side2count + 1
    sidenumber = sidenumber + 1
  }
  while (side3 > side3count){
    println("Sides " + sidenumber + ": Salad")
    side3count = side3count + 1
    sidenumber = sidenumber + 1
  }
  while (side4 > side4count){
    println("Sides " + sidenumber + ": Cole Slaw")
    side4count = side4count + 1
    sidenumber = sidenumber + 1
  }
  while (side5 > side5count){
    println("Sides " + sidenumber + ": Potato Salad")
    side5count = side5count + 1
    sidenumber = sidenumber + 1
  }
  //Loyalty Program and bill
  println("Are you a member of the discount program?")
  var loyal = readLine().toUpperCase
  if (loyal == "Y" || loyal == "YES") {
    var discount = (pennies * 0.1).toInt
    pennies = pennies - discount
  } else { pennies = pennies }
  println(f"Your bill is $$${pennies/100}.${pennies%100}%02d")
  var tax = ((pennies * 0.0635) + 0.5).toInt
  println(f"Your tax is $$${tax/100}.${tax%100}%02d")
  pennies = pennies + tax
  println(f"You owe $$${pennies/100}.${pennies%100}%02d") 
}