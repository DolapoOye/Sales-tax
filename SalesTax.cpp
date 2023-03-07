/* Program Purpose: This program asks the user to input the total sales of a business 
and then calculates state tax, local tax, and final sales of the business
*/
#include <iostream>
#include <iomanip> // For setprecision
using namespace std;

int main(){

    // Defining constants
    const float state_Tax = 0.307;
    const float local_Tax = 0.06;

    // Declaring variables
    float totalSales , state , local , finalsales;

    // This is to input the total sales of the business
    cout << "Input total sales ";
    cin >> totalSales;

    // Calculations for state tax, local tax and final sales
    state = (totalSales * state_Tax); // STATETAX
    local = (totalSales * local_Tax); // LOCALTAX
    finalsales = (totalSales - state - local); // FINAL SALES

    // Set precision to 2 decimal places
    cout << setprecision(2) << fixed << showpoint;

    // Output to the end user
    cout << "The total sales for the month is " << totalSales << endl;
    cout << "The state tax for the month is " << state << endl;
    cout << "The local tax for the month is " << local << endl;
    cout << "The final sales amount is " << finalsales << endl;

    return 0;


}