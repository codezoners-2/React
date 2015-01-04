/** @jsx React.DOM */

var Clock = React.createClass({
    getInitialState: function () {
        return { };
    },

    render: function () {
        return <div className="row">
                  <div className="col-md-offset-4 col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>

                  <div className="col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>

                  <div className="col-md-1">
                     <h1><span className="label label-primary">00</span></h1>
                  </div>
               </div>;
    }
});

React.renderComponent(
    <Clock />,
    document.getElementById('container')
);
