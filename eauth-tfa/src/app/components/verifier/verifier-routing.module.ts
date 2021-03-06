import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {VerifierComponent} from './verifier.component';

const routes: Routes = [
	{
		path: '',
		component: VerifierComponent,
	},
];

@NgModule({
	imports: [RouterModule.forChild(routes)],
	exports: [RouterModule],
})
export class VerifierRoutingModule {}
