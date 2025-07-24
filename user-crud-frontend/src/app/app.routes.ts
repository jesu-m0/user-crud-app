import { Routes } from '@angular/router';
import { UserListComponent } from './users/views/user-list/user-list.component';

export const routes: Routes = [
  { path: '', redirectTo: '/users', pathMatch: 'full' },
  { path: 'users', component: UserListComponent },
  //{ path: 'users/:id', component: UserDetailComponent },

  { path: '**', redirectTo: '/users'}
];
