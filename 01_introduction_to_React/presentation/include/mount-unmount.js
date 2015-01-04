componentDidMount: function() {
    this.interval = setInterval(this.tick, 1000);
},

componentWillUnmount: function() {
    clearInterval(this.interval);
},
