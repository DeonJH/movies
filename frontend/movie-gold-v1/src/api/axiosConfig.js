import axios from 'axios';
import { API_URL } from './envConfig';

export default axios.create({
    baseURL: API_URL,
    headers: {"ngrok-skip-browser-warnings": "true"}
});