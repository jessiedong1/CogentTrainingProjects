// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-movies',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })

export class AppComponent  
{  
    items: item[] = [{name: 'One', val: 1}, {name: 'Two', val: 2}, {name: 'Three', val: 3}];  
    selectedValue: string= 'One';  
}  
class item {  
    name: string;  
    val: number;  
}  