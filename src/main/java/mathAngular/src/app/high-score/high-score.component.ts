import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";


@Component({
  selector: 'app-high-score',
  templateUrl: './high-score.component.html',
  styleUrls: ['./high-score.component.css']
})
export class HighScoreComponent implements OnInit {

  response: any;
  sizeOfDatabasse: number;

  // this.response[0].id

  constructor(private http: HttpClient) {
  }




  getAllDatabaseResponse(dbResponse){

    for(var i = 0 ; i< dbResponse.length; i++){

    }



  }
  ngOnInit() {
    let obs = this.http.get("http://localhost:8080/highscore");
    obs.subscribe((response) => {
      console.log(response);
      this.response = response;
      console.log("==================");
      console.log("HIGHSCORE!!!");
      console.log("==================");
      this.getAllDatabaseResponse(this.response);


    });


  }
}
