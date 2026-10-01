1. Which parameter lists make the two Cart.addItem methods valid overloads? Why is a changed return type alone insufficient?

Two Cart.addItem methods are valid overloads when their parameter lists are different, for example:
addItem(double price)
addItem(double price, int quantity)

A changed return type alone is insufficient because Java does not consider the return type part of a method signature for overloading.

2. Why does increaseNumber(n) not modify the caller’s integer in Activity 2?

increaseNumber(n) does not modify the caller’s integer because Java is pass-by-value. The method receives a copy of the integer’s value, so changing the parameter changes only the local copy.

3. Why can updateObject(progress) change the original object even though Java is pass-by-value?

updateObject(progress) can change the original object because the copied value is a reference to the same object. Java passes the reference by value. Both the caller’s reference and the method’s parameter refer to the same object, so modifying the object’s fields is visible to the caller.

4. Why does rebinding p inside replaceLocal(p) not redirect the caller’s reference?

Rebinding p does not redirect the caller’s reference because the parameter p is a copy of the reference. If p is assigned to a new object inside the method, only the local parameter points to the new object. The caller’s original reference remains unchanged.

5. Name two StudentProfile invariants and identify the method responsible for maintaining each one.

1. GPA must remain between 0.0 and 4.0.
   Method responsible: setGpa(double value)

2. Student ID can be registered only once and cannot be blank.
   Method responsible: registerId(String id)

Another valid invariant is that completed credits can only increase through the API. This is maintained by addCredits(int amount), which accepts only positive amounts.

6. Why does DigitalWallet provide deposit()/spend() but no public setBalance()?

DigitalWallet provides deposit() and spend() instead of setBalance() so that every balance change is validated. A public setBalance() could allow invalid operations such as setting the balance to -500. deposit() and spend() ensure that the balance never becomes negative.

7. Which AccessBox members are readable by an unrelated class in another package? What changes for a client in the same package?

For an unrelated class in another package:
public open       -> Yes
protected family  -> No
packageOnly       -> No
private secret    -> No

For a client in the same package:
public open       -> Yes
protected family  -> Yes
packageOnly       -> Yes
private secret    -> No

The private secret member can only be directly accessed inside AccessBox itself.

8. Write the LibraryBook invariant and identify two rejected operations in the test sequence.

The LibraryBook invariant is:
0 <= borrowedCopies <= totalCopies

In words, borrowed copies can never be negative and can never exceed the total number of copies.

Two rejected operations are:
borrow(2) -> false, because only 1 copy was available at that point.
returnCopies(2) -> false, because only 1 copy was currently borrowed.