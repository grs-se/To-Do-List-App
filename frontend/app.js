// Function to handle adding tasks
function addTask() {
    const taskInput = document.getElementById("taskInput").value;

    // Validation to make sure input is not empty
    if (taskInput === "") {
        alert("Please enter a task!");
        return;
    }

    // Add task to the list
    const taskList = document.getElementById("taskList");
    const taskItem = document.createElement("li");
    taskItem.textContent = taskInput;
    
    // Add Delete button
    const deleteButton = document.createElement("button");
    deleteButton.textContent = "Delete";
    deleteButton.onclick = function() {
        taskList.removeChild(taskItem);
    };

    // Append delete button to task item and task item to list
    taskItem.appendChild(deleteButton);
    taskList.appendChild(taskItem);

    // Clear input after adding
    document.getElementById("taskInput").value = "";
}