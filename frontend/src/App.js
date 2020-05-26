import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Route, BrowserRouter as Router } from "react-router-dom";
import AddEmployee from './AddEmployee';
import SimpleTable from './Table';

function App() {
  return (
    <div className="App">
      <Router>
        <Route exact path="/" component={AddEmployee} />
        <Route exact path="/view" component={SimpleTable} />
      </Router>
    </div>
  );
}

export default App;
