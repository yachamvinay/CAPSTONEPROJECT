import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  constructor(private _http:HttpClient) { }

  public createPost(post:any, id:any){
    return this._http.post(`${baseUrl}/user/create-post/${id}`,post)
  }

  public getPostByQuestionId(id:any){
    return this._http.get(`${baseUrl}/user/user-post/${id}`)
  }

  public getAllPost(){
    return this._http.get(`${baseUrl}/user/all-posts/`)
  }
}
