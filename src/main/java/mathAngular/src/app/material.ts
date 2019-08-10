import {NgModule} from "@angular/core";
import {MatCheckboxModule} from "@angular/material";
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';


@NgModule({

  imports: [MatCheckboxModule, MatButtonToggleModule, MatIconModule, MatListModule],
  exports: [MatCheckboxModule, MatButtonToggleModule, MatIconModule, MatListModule],


})
export class MaterialModule {

}
