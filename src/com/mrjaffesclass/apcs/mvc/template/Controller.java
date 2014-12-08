package com.mrjaffesclass.apcs.mvc.template;
import com.mrjaffesclass.apcs.messenger.*;
import java.awt.Color;

/**
 * 
 * The Controller is the master of the App you're writing. It instantiates the
 * view and the model, receives messages from the View in response to user
 * interface (UI) actions like clicking a button, changing an input field, 
 * etc.  It also sends and receives messages to the Model to commuincate
 * changes required and changes made to the Model variables.  
 *
 * @author Roger Jaffe
 * @version 1.0
 */
public class Controller implements MessageHandler {

  private final Messenger mvcMessaging;

  /**
   * Controller constructor The Controller is responsible for creating the View
   * and the Model that it will be controlling. The mvcMessaging object is
   * passed to the view and the model and is used as a local messenger
   * between the Controller, Model and View without have direct access to the
   * View and Model.  Remember, you want the three components separated so
   * that one class works independently of the others.
   *
   * Messages that can be received in the Controller:
   *  view:toggleButtonClick (sent by the View when the toggle button is clicked)
   *  view:buttonClick (sent by the View when the regular button is clicked)
   *  view:changeButton (sent by the View when the Up or Down buttons are clicked)
   * Message that are sent from the Controller:
   *  controller:changeButton (sent by the Controller to notify the Model to change 
   *    the value of a Model variable
   */
  public Controller() {
 
