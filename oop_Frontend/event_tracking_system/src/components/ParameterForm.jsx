import React, { useState } from "react";

function ParameterForm() {
  const [inputs, setInputs] = useState({
    totalTickets: "",
    releaseRate: "",
    retrievalRate: "",
    maxCapacity: "",
    vendors: "",
    customers: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setInputs((prev) => ({ ...prev, [name]: value }));
  };

  const handleReset = () => {
    setInputs({
      totalTickets: "",
      releaseRate: "",
      retrievalRate: "",
      maxCapacity: "",
      vendors: "",
      customers: "",
    });
  };

  return (
    <div className="card parameter-card">
      <h2>System Configuration</h2>
      {Object.keys(inputs).map((key) => (
        <div key={key}>
          <label>{key.replace(/([A-Z])/g, " $1")}</label>
          <input
            type="number"
            name={key}
            value={inputs[key]}
            onChange={handleChange}
            placeholder={`Enter ${key.replace(/([A-Z])/g, " $1").toLowerCase()}`}
          />
        </div>
      ))}
      <button className="btn start">Start System</button>
      <button className="btn stop" onClick={handleReset}>
        Stop
      </button>
    </div>
  );
}

export default ParameterForm;
