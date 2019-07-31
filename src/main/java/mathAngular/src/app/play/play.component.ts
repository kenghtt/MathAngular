import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {delay, startWith} from "rxjs/operators";
@Component({
  selector: 'app-play',
  templateUrl: './play.component.html',
  styleUrls: ['./play.component.css']
})
export class PlayComponent implements OnInit {
  title = 'mathAngular';
  someNum = 0;
  response: any;
  constructor(private http: HttpClient) { }

  answer: string;
  x: string;
  y: string;
  potentialAnswer1: string;
  potentialAnswer2: string;
  potentialAnswer3: string;
  potentialAnswer4: string;
  totalLength: any;// or number
  currentArray = 0;
  currentQuestion = 1;
  currentQuestionArray;
  numOfCorrectAnswers = 0;
  countDownNumber = 30;



  checkAnswer(event){
    if(event.target.innerText == this.answer){
      this.numOfCorrectAnswers++;
    }
    console.log(" "+this.answer);
    console.log("Correct Answers: "+this.numOfCorrectAnswers);
  }

  startCountdown(){

    var interval = setInterval(() => {
      console.log(this.countDownNumber);
      this.countDownNumber--;


      if(this.countDownNumber < 0 ){

        // The code here will run when
        // the timer has reached zero.

        clearInterval(interval);
        console.log('Ding!');
      };
    }, 1000);
  };



  getNextQuestion() {
    this.answer = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["Answer"];
    this.x = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["x"];
    this.y = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["y"];
    this.potentialAnswer1 = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["potentialAnswer1"];
    this.potentialAnswer2 = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["potentialAnswer2"];
    this.potentialAnswer3 = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["potentialAnswer3"];
    this.potentialAnswer4 = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion]["potentialAnswer4"];

    this.currentQuestionArray = this.response.MathQuestions[this.currentArray]["Question " + this.currentQuestion];
    // this.someAnswer = this.potentialAnswer1 = this.response.MathQuestions[this.currentQuestion];

    // this.someAnswer["Question 1"]
    // console.log(this.currentQuestionArray);
    this.currentArray++;
    this.currentQuestion++;
  }


  ngOnInit() {
    let obs = this.http.get("http://localhost:8080/mathQuestions");
    obs.subscribe((response) => {
      this.someNum += 1;
      console.log(response);
      this.response = response;
      console.log("==================");

      this.totalLength = this.response.MathQuestions.length;
      this.getNextQuestion();


//   response.MathQuestions[0]["Question 1"]["potentialAnswer1"]   == potentialAnswer1   :)

    });


  }

}







