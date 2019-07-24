import {NgModule} from "@angular/core";
import { MatCheckboxModule} from "@angular/material";
import {MatButtonToggleModule} from '@angular/material/button-toggle';
import {MatIconModule} from '@angular/material/icon';


@NgModule({

  imports: [ MatCheckboxModule,MatButtonToggleModule,MatIconModule],
  exports: [ MatCheckboxModule,MatButtonToggleModule,MatIconModule],


})
export class MaterialModule {

}
