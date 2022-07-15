import { Component } from '@angular/core';
import { Plugins } from '@capacitor/core';
import 'contacts-plugin';

const { ContactsPlugin } = Plugins;

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  contacts = [];

  constructor() {}


  async loadContacts() {
    console.log('calling getContacts')
    this.contacts = (await ContactsPlugin.getContacts()).results;
    console.log('my contacts: ', this.contacts);
  }
}
