# Clean Code

### **Objective:**
* Refactor (aka clean up) the code in the `Inventory` class to make it more maintainable and readable.

### **Purpose:**
* To understand why writing test matter
* To understand why writing readable code matter

### **Instructions:**

1. Fork this Repository
    * [fork](https://help.github.com/articles/fork-a-repo/) this repository to your personal github account
    * [clone](https://help.github.com/articles/cloning-a-repository/) **your** `forked` repository to your local machine.
    * clean up the code in the `Inventory` class
    * commit your changes
    * submit a `pull request` which compares Zipcoder your branch with the branch level (eg. if you work on level2, the base should be zipcode's level2 branch compare to your level2 branch)
3. DO NOT CHANGE THE TEST

# Levels
This lab is divided into two levels. If you are 90% done with your labs or if you want to challenge yourself, get level2 with `git checkout level2` after you clone the repository. Otherwise, work on the master branch. 

# Part 1 - Original Description of the Gilded Rose

Hi and welcome to team Gilded Rose. As you know, we are a small inn
with a prime location in a prominent city run by a friendly innkeeper
named Allison. We also buy and sell only the finest
goods. Unfortunately, our goods are constantly degrading in quality as
they approach their sell by date. We have a system in place that
updates our inventory for us. It was developed by a no-nonsense type
named Leeroy, who has moved on to new adventures. Your task is to add
the new feature to our system so that we can begin selling a new
category of items. First an introduction to our system:

- All items have a SellIn value which denotes the number of days we
  have to sell the item
- All items have a Quality value which denotes how valuable the item
  is
- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

  - Once the sell by date has passed, Quality degrades twice as fast
  - The Quality of an item is never negative
  - "Aged Brie" actually increases in Quality the older it gets
  - The Quality of an item is never more than 50
  - "Sulfuras", being a legendary item, never has to be sold or
    decreases in Quality
  - "Backstage passes", like aged brie, increases in Quality as it's
    SellIn value approaches; Quality increases by 2 when there are 10
    days or less and by 3 when there are 5 days or less but Quality
    drops to 0 after the concert

Just for clarification, an item can never have its Quality increase
above 50, however "Sulfuras" is a legendary item and as such its
Quality is 80 and it never alters.

DO NOT alter the Item class or Items property as those belong to the goblin
in the corner who will insta-rage and one-shot you as he doesn't
believe in shared code ownership (you can make the UpdateQuality
method and Items property static if you like, we'll cover for
you).

## Part 2 - Add a new item

We have recently signed a supplier of conjured items. This requires an update to our system:

- "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any
new code as long as everything still works correctly.


This was "borrowed" from [alexaitken](https://github.com/alexaitken/GildedRose_java) which originated from [Bobby Johnson's Blog](https://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).
