package testJava;

import java.util.*;

//TODO: complete this object/class

public class PaginationHelper<I> {

int itemsPerPage = 0;
List<I> liste = new ArrayList<I>();
/**
* The constructor takes in an array of items and a integer indicating how many
* items fit within a single page
*/
public PaginationHelper(List<I> collection, int itemsPerPage) {
 this.itemsPerPage = itemsPerPage;
 this.liste = collection;
}

/**
* returns the number of items within the entire collection
*/
public int itemCount() {
   return liste.size();
}

/**
* returns the number of pages
*/
public int pageCount() {
int numberPage = 0;
 if(liste.size()%itemsPerPage == 0){
     numberPage = (liste.size()-1)/itemsPerPage;
   }else{
    numberPage = (liste.size()-1)/itemsPerPage +1;
    }
    
    return numberPage;
}

/**
* returns the number of items on the current page. page_index is zero based.
* this method should return -1 for pageIndex values that are out of range
*/
public int pageItemCount(int pageIndex) {
 int invalid = -1;
 if(liste.size()%itemsPerPage == 0)
   {
     invalid = itemsPerPage;
   }
   else{
     invalid = liste.size() -itemsPerPage;
   }
   return invalid;
}

/**
* determines what page an item is on. Zero based indexes
* this method should return -1 for itemIndex values that are out of range
*/
public int pageIndex(int itemIndex) {
 
 if(liste.isEmpty() || itemIndex > liste.size()){
   return -1;
 }
 
 if(itemIndex%itemsPerPage==0)
 {
   return itemIndex/itemsPerPage;
 }else{
   return (itemIndex)/(itemsPerPage)+1;
 }
}
}