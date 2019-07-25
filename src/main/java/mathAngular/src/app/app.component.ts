import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'mathAngular';

  first(event) {
    console.log(event);
  }

  second() {
    console.log('clicked 2');
  }

  third() {
    console.log('clicked 3');
  }

  fourth() {
    console.log('clicked 4');
  }

}
