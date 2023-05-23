FROM node:18.12-alpine

WORKDIR /vue-frontend

COPY . .

EXPOSE 8081

RUN npm install

CMD ["npm","run","serve"]