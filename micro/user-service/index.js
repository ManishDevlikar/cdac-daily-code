const express = require('express');
const axios = require('axios');
const app = express();
app.use(express.json());

const users = [
  { id: 1, name: 'John Doe', email: 'john@example.com' },
  { id: 2, name: 'Jane Doe', email: 'jane@example.com' },
];

// Endpoint to get user details
app.get('/users/:id', (req, res) => {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).send('User not found');
  res.json(user);
});

// Endpoint to create an order (communicates with Order Service)
app.post('/users/:id/orders', async (req, res) => {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).send('User not found');

  const order = req.body;
  try {
    const response = await axios.post('http://localhost:5002/orders', { userId: user.id, ...order });
    res.json(response.data);
  } catch (error) {
    res.status(500).send('Error creating order');
  }
});

app.listen(3000, () => console.log('User Service running on port 3000'));